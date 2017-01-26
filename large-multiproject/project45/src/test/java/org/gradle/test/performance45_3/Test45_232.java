package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_232 {
    private final Production45_232 production = new Production45_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}