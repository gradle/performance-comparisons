package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_164 {
    private final Production17_164 production = new Production17_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}