package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_149 {
    private final Production17_149 production = new Production17_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}