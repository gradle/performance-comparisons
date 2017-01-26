package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_405 {
    private final Production7_405 production = new Production7_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}