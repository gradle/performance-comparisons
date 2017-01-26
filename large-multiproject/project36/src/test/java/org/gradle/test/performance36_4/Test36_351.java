package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_351 {
    private final Production36_351 production = new Production36_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}