package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_103 {
    private final Production17_103 production = new Production17_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}