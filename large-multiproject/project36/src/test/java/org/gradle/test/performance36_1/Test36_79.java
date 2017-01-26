package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_79 {
    private final Production36_79 production = new Production36_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}