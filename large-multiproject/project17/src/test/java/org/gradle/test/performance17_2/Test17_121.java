package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_121 {
    private final Production17_121 production = new Production17_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}