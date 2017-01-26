package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_409 {
    private final Production36_409 production = new Production36_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}