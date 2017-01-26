package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_368 {
    private final Production45_368 production = new Production45_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}