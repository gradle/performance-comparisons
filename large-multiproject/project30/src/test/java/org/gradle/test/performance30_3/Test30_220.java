package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_220 {
    private final Production30_220 production = new Production30_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}