package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_443 {
    private final Production45_443 production = new Production45_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}