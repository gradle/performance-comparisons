package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_274 {
    private final Production36_274 production = new Production36_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}