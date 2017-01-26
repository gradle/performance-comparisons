package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_272 {
    private final Production73_272 production = new Production73_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}