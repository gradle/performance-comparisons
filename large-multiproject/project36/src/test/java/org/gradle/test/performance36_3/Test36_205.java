package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_205 {
    private final Production36_205 production = new Production36_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}