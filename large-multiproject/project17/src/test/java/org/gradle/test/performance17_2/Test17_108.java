package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_108 {
    private final Production17_108 production = new Production17_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}