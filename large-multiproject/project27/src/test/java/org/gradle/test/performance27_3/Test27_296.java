package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_296 {
    private final Production27_296 production = new Production27_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}