package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_152 {
    private final Production36_152 production = new Production36_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}