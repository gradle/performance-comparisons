package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_69 {
    private final Production36_69 production = new Production36_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}