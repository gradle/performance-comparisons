package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_254 {
    private final Production36_254 production = new Production36_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}