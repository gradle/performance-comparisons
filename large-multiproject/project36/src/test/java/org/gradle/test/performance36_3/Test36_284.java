package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_284 {
    private final Production36_284 production = new Production36_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}