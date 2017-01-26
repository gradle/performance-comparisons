package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_428 {
    private final Production45_428 production = new Production45_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}