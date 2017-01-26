package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_105 {
    private final Production36_105 production = new Production36_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}