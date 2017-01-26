package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_301 {
    private final Production45_301 production = new Production45_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}