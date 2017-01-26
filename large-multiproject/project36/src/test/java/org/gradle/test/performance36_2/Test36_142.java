package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_142 {
    private final Production36_142 production = new Production36_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}