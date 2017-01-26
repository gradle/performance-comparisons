package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_16 {
    private final Production36_16 production = new Production36_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}