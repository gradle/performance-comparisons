package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_182 {
    private final Production36_182 production = new Production36_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}