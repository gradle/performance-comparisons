package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_348 {
    private final Production17_348 production = new Production17_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}