package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_56 {
    private final Production73_56 production = new Production73_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}