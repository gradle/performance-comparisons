package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_271 {
    private final Production73_271 production = new Production73_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}