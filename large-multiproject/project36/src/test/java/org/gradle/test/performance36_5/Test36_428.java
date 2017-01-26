package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_428 {
    private final Production36_428 production = new Production36_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}