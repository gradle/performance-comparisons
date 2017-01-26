package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_409 {
    private final Production17_409 production = new Production17_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}