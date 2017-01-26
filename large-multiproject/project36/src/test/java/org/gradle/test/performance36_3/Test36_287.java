package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_287 {
    private final Production36_287 production = new Production36_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}