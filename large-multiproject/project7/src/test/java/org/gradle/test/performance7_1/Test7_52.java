package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_52 {
    private final Production7_52 production = new Production7_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}