package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_452 {
    private final Production36_452 production = new Production36_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}