package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_492 {
    private final Production36_492 production = new Production36_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}