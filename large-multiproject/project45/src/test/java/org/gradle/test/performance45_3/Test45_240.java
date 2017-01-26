package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_240 {
    private final Production45_240 production = new Production45_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}