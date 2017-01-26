package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_152 {
    private final Production45_152 production = new Production45_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}