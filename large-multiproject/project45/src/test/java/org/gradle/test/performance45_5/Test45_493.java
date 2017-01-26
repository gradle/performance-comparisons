package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_493 {
    private final Production45_493 production = new Production45_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}