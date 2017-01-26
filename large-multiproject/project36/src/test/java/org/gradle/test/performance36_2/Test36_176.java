package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_176 {
    private final Production36_176 production = new Production36_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}