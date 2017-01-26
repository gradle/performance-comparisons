package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_139 {
    private final Production30_139 production = new Production30_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}