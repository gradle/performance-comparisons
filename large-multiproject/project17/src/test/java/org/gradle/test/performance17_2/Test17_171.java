package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_171 {
    private final Production17_171 production = new Production17_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}