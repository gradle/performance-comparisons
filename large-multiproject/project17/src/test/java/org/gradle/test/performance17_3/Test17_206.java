package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_206 {
    private final Production17_206 production = new Production17_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}