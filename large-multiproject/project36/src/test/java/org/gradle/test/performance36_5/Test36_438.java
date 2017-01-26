package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_438 {
    private final Production36_438 production = new Production36_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}