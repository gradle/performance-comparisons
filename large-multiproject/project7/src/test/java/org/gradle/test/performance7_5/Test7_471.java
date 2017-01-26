package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_471 {
    private final Production7_471 production = new Production7_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}