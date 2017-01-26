package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_2 {
    private final Production30_2 production = new Production30_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}