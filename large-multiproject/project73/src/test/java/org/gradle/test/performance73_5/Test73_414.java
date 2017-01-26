package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_414 {
    private final Production73_414 production = new Production73_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}