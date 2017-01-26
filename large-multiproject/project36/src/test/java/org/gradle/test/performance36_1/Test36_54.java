package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_54 {
    private final Production36_54 production = new Production36_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}