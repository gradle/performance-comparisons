package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_489 {
    private final Production17_489 production = new Production17_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}