package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_175 {
    private final Production30_175 production = new Production30_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}