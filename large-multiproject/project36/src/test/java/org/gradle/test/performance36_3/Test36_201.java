package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_201 {
    private final Production36_201 production = new Production36_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}