package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_150 {
    private final Production36_150 production = new Production36_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}