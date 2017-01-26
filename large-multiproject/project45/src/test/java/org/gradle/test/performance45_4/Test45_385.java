package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_385 {
    private final Production45_385 production = new Production45_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}