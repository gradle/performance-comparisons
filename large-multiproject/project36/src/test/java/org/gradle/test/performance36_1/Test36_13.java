package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_13 {
    private final Production36_13 production = new Production36_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}