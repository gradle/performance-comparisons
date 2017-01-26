package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_201 {
    private final Production17_201 production = new Production17_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}