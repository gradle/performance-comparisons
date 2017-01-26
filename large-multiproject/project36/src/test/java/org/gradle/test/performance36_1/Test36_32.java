package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_32 {
    private final Production36_32 production = new Production36_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}