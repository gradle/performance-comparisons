package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_153 {
    private final Production73_153 production = new Production73_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}