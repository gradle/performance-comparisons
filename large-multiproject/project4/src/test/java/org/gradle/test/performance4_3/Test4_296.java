package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_296 {
    private final Production4_296 production = new Production4_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}