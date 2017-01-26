package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_121 {
    private final Production45_121 production = new Production45_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}