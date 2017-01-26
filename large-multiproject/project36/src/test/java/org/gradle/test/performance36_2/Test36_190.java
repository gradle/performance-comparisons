package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_190 {
    private final Production36_190 production = new Production36_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}