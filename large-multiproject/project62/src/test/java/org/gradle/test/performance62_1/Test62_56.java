package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_56 {
    private final Production62_56 production = new Production62_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}