package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_247 {
    private final Production36_247 production = new Production36_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}