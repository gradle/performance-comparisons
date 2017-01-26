package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_149 {
    private final Production36_149 production = new Production36_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}