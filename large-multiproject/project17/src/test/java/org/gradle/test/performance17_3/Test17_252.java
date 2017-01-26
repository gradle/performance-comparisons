package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_252 {
    private final Production17_252 production = new Production17_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}