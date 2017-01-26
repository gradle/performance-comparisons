package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_319 {
    private final Production73_319 production = new Production73_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}