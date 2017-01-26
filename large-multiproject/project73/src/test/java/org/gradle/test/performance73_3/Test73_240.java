package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_240 {
    private final Production73_240 production = new Production73_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}