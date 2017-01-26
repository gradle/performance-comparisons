package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_161 {
    private final Production36_161 production = new Production36_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}