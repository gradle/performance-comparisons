package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_379 {
    private final Production17_379 production = new Production17_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}