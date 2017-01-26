package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_400 {
    private final Production36_400 production = new Production36_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}