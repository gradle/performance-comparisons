package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_11 {
    private final Production73_11 production = new Production73_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}