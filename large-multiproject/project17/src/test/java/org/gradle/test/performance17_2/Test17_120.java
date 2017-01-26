package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_120 {
    private final Production17_120 production = new Production17_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}