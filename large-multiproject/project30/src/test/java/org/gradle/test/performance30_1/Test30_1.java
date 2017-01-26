package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_1 {
    private final Production30_1 production = new Production30_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}