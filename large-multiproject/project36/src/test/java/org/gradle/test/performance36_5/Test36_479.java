package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_479 {
    private final Production36_479 production = new Production36_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}