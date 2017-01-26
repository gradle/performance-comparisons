package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_349 {
    private final Production36_349 production = new Production36_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}