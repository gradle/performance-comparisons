package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_413 {
    private final Production45_413 production = new Production45_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}