package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_143 {
    private final Production30_143 production = new Production30_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}