package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_473 {
    private final Production36_473 production = new Production36_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}