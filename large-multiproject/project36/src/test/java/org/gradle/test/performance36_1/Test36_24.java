package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_24 {
    private final Production36_24 production = new Production36_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}