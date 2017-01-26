package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_242 {
    private final Production17_242 production = new Production17_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}