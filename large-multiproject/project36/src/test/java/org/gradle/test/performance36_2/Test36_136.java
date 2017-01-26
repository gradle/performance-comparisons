package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_136 {
    private final Production36_136 production = new Production36_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}