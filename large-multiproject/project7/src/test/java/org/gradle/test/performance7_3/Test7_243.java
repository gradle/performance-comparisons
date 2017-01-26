package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_243 {
    private final Production7_243 production = new Production7_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}