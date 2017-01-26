package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_180 {
    private final Production36_180 production = new Production36_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}