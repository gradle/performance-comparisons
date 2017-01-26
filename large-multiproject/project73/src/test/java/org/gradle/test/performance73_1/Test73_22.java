package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_22 {
    private final Production73_22 production = new Production73_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}