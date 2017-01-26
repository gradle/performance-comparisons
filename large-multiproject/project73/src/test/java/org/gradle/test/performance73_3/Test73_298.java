package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_298 {
    private final Production73_298 production = new Production73_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}