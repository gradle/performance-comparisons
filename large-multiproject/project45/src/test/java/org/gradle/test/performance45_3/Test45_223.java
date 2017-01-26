package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_223 {
    private final Production45_223 production = new Production45_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}