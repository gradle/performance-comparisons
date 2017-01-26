package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_122 {
    private final Production36_122 production = new Production36_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}