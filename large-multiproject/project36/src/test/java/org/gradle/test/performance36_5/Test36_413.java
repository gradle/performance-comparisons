package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_413 {
    private final Production36_413 production = new Production36_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}