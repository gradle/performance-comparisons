package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_125 {
    private final Production36_125 production = new Production36_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}