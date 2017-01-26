package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_312 {
    private final Production17_312 production = new Production17_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}