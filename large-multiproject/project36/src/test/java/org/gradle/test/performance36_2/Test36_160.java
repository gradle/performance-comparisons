package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_160 {
    private final Production36_160 production = new Production36_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}