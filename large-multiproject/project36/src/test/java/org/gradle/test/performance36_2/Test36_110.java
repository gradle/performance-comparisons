package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_110 {
    private final Production36_110 production = new Production36_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}