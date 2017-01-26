package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_146 {
    private final Production36_146 production = new Production36_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}