package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_170 {
    private final Production36_170 production = new Production36_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}