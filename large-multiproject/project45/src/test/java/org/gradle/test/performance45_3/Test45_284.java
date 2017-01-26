package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_284 {
    private final Production45_284 production = new Production45_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}