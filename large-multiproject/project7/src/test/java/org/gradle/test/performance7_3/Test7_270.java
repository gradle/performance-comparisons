package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_270 {
    private final Production7_270 production = new Production7_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}