package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_436 {
    private final Production17_436 production = new Production17_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}