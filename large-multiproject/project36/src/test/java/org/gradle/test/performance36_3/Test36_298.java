package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_298 {
    private final Production36_298 production = new Production36_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}