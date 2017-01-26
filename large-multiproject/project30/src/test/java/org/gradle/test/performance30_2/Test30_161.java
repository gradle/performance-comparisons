package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_161 {
    private final Production30_161 production = new Production30_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}