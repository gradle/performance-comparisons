package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_116 {
    private final Production17_116 production = new Production17_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}