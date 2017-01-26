package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_311 {
    private final Production36_311 production = new Production36_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}