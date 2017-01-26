package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_283 {
    private final Production36_283 production = new Production36_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}