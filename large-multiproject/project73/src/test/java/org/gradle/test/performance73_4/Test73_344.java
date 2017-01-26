package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_344 {
    private final Production73_344 production = new Production73_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}