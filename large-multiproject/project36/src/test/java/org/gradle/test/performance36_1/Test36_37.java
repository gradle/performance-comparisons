package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_37 {
    private final Production36_37 production = new Production36_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}