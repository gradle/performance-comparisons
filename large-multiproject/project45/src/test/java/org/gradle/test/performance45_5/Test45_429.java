package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_429 {
    private final Production45_429 production = new Production45_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}