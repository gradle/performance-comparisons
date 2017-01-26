package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_34 {
    private final Production36_34 production = new Production36_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}