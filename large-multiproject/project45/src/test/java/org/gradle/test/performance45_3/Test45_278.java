package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_278 {
    private final Production45_278 production = new Production45_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}