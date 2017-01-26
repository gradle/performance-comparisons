package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_222 {
    private final Production7_222 production = new Production7_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}