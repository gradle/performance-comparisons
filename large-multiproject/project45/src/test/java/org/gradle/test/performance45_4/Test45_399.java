package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_399 {
    private final Production45_399 production = new Production45_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}