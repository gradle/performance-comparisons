package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_87 {
    private final Production30_87 production = new Production30_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}