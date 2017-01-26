package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_152 {
    private final Production30_152 production = new Production30_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}