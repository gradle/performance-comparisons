package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_316 {
    private final Production45_316 production = new Production45_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}