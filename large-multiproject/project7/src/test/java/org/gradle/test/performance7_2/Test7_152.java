package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_152 {
    private final Production7_152 production = new Production7_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}