package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_389 {
    private final Production45_389 production = new Production45_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}