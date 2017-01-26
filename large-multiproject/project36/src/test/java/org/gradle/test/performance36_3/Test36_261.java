package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_261 {
    private final Production36_261 production = new Production36_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}