package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_35 {
    private final Production30_35 production = new Production30_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}