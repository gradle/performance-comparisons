package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_131 {
    private final Production17_131 production = new Production17_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}