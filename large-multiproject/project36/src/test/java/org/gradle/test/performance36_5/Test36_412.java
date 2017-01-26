package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_412 {
    private final Production36_412 production = new Production36_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}