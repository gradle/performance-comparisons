package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_370 {
    private final Production73_370 production = new Production73_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}