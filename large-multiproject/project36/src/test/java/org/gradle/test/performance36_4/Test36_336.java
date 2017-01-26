package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_336 {
    private final Production36_336 production = new Production36_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}