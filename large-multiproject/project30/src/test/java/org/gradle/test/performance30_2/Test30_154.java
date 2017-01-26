package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_154 {
    private final Production30_154 production = new Production30_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}