package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_370 {
    private final Production45_370 production = new Production45_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}