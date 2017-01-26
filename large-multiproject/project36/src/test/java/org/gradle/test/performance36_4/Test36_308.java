package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_308 {
    private final Production36_308 production = new Production36_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}