package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_279 {
    private final Production17_279 production = new Production17_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}