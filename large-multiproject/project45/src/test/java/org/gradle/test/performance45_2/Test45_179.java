package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_179 {
    private final Production45_179 production = new Production45_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}