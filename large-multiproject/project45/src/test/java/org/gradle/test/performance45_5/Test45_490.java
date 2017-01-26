package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_490 {
    private final Production45_490 production = new Production45_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}