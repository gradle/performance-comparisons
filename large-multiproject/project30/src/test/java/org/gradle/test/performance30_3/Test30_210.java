package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_210 {
    private final Production30_210 production = new Production30_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}