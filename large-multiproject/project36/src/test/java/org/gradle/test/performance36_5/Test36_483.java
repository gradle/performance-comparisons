package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_483 {
    private final Production36_483 production = new Production36_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}