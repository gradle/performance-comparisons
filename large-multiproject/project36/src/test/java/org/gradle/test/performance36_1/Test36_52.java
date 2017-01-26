package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_52 {
    private final Production36_52 production = new Production36_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}