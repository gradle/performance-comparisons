package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_169 {
    private final Production45_169 production = new Production45_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}