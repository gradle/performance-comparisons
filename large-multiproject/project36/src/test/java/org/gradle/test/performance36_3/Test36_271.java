package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_271 {
    private final Production36_271 production = new Production36_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}