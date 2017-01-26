package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_247 {
    private final Production45_247 production = new Production45_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}