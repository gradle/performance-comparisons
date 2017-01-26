package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_274 {
    private final Production17_274 production = new Production17_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}