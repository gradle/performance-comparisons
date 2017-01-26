package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_333 {
    private final Production36_333 production = new Production36_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}