package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_278 {
    private final Production73_278 production = new Production73_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}