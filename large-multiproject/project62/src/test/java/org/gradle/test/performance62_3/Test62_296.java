package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_296 {
    private final Production62_296 production = new Production62_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}