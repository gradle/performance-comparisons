package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_344 {
    private final Production45_344 production = new Production45_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}