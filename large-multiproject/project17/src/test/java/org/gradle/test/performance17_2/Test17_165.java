package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_165 {
    private final Production17_165 production = new Production17_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}