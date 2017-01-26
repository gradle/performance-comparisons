package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_56 {
    private final Production36_56 production = new Production36_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}