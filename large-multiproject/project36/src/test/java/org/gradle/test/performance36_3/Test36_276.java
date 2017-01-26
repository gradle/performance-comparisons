package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_276 {
    private final Production36_276 production = new Production36_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}