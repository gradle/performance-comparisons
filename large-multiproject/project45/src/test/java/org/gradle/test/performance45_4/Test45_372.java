package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_372 {
    private final Production45_372 production = new Production45_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}