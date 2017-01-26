package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_292 {
    private final Production36_292 production = new Production36_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}