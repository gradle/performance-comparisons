package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_252 {
    private final Production36_252 production = new Production36_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}