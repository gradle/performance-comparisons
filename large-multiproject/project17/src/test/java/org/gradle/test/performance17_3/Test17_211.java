package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_211 {
    private final Production17_211 production = new Production17_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}