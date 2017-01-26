package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_233 {
    private final Production17_233 production = new Production17_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}