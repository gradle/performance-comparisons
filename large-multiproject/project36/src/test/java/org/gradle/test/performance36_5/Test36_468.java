package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_468 {
    private final Production36_468 production = new Production36_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}