package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_335 {
    private final Production45_335 production = new Production45_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}