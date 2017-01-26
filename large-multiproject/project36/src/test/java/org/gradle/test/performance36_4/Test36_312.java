package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_312 {
    private final Production36_312 production = new Production36_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}