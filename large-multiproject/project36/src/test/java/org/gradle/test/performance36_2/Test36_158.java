package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_158 {
    private final Production36_158 production = new Production36_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}