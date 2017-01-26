package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_232 {
    private final Production36_232 production = new Production36_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}