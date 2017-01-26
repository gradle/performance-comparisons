package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_23 {
    private final Production45_23 production = new Production45_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}