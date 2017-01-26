package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_410 {
    private final Production45_410 production = new Production45_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}