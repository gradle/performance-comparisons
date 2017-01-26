package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_125 {
    private final Production17_125 production = new Production17_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}