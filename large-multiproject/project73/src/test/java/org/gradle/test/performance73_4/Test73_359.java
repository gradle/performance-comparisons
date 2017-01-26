package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_359 {
    private final Production73_359 production = new Production73_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}