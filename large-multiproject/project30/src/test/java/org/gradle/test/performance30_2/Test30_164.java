package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_164 {
    private final Production30_164 production = new Production30_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}