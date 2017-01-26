package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_448 {
    private final Production45_448 production = new Production45_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}