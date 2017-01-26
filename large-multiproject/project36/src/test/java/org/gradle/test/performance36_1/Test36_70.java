package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_70 {
    private final Production36_70 production = new Production36_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}