package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_256 {
    private final Production36_256 production = new Production36_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}