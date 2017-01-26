package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_379 {
    private final Production30_379 production = new Production30_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}