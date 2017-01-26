package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_244 {
    private final Production36_244 production = new Production36_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}