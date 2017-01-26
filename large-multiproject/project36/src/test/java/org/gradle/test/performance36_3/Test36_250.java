package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_250 {
    private final Production36_250 production = new Production36_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}