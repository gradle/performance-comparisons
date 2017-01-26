package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_328 {
    private final Production17_328 production = new Production17_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}