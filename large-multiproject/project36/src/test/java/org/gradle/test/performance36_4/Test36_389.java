package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_389 {
    private final Production36_389 production = new Production36_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}