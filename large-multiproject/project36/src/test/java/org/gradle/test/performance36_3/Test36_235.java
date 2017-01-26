package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_235 {
    private final Production36_235 production = new Production36_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}