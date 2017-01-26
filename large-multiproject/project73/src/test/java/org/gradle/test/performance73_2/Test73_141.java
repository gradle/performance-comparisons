package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_141 {
    private final Production73_141 production = new Production73_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}