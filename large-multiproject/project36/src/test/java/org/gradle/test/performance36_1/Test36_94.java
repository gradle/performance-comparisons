package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_94 {
    private final Production36_94 production = new Production36_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}