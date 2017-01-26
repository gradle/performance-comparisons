package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_242 {
    private final Production36_242 production = new Production36_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}