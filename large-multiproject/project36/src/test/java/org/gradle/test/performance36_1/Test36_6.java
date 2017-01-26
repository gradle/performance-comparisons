package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_6 {
    private final Production36_6 production = new Production36_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}