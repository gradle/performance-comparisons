package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_342 {
    private final Production36_342 production = new Production36_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}