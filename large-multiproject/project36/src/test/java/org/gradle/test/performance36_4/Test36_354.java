package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_354 {
    private final Production36_354 production = new Production36_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}