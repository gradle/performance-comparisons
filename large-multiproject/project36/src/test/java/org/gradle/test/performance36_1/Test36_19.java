package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_19 {
    private final Production36_19 production = new Production36_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}