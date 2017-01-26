package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_414 {
    private final Production36_414 production = new Production36_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}