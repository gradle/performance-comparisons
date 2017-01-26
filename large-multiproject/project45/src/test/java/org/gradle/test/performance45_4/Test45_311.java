package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_311 {
    private final Production45_311 production = new Production45_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}