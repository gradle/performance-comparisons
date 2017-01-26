package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_372 {
    private final Production36_372 production = new Production36_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}