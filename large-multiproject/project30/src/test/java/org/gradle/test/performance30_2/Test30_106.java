package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_106 {
    private final Production30_106 production = new Production30_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}