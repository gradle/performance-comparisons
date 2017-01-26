package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_250 {
    private final Production45_250 production = new Production45_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}