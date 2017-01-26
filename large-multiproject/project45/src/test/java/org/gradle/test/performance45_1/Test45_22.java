package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_22 {
    private final Production45_22 production = new Production45_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}