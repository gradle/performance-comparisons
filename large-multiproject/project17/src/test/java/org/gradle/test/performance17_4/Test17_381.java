package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_381 {
    private final Production17_381 production = new Production17_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}