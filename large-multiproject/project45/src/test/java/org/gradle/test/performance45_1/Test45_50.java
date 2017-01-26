package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_50 {
    private final Production45_50 production = new Production45_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}