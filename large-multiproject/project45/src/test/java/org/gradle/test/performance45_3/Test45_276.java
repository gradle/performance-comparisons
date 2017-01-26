package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_276 {
    private final Production45_276 production = new Production45_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}