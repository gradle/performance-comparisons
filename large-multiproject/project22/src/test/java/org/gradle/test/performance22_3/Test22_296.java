package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_296 {
    private final Production22_296 production = new Production22_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}