package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_280 {
    private final Production45_280 production = new Production45_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}