package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_391 {
    private final Production45_391 production = new Production45_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}