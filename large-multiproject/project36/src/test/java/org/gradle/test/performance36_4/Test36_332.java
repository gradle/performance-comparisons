package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_332 {
    private final Production36_332 production = new Production36_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}