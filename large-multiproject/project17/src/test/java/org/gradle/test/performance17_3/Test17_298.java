package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_298 {
    private final Production17_298 production = new Production17_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}