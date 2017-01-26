package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_368 {
    private final Production73_368 production = new Production73_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}