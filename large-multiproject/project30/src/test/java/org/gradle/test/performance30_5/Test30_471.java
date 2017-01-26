package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_471 {
    private final Production30_471 production = new Production30_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}