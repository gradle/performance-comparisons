package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_18 {
    private final Production36_18 production = new Production36_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}