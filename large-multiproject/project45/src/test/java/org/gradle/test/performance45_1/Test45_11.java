package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_11 {
    private final Production45_11 production = new Production45_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}