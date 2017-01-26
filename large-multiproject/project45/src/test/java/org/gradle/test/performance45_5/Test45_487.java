package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_487 {
    private final Production45_487 production = new Production45_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}