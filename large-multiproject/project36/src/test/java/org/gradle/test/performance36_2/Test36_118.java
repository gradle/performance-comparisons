package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_118 {
    private final Production36_118 production = new Production36_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}