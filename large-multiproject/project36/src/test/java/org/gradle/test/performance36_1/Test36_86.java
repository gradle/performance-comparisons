package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_86 {
    private final Production36_86 production = new Production36_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}