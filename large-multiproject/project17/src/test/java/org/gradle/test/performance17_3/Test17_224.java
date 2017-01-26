package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_224 {
    private final Production17_224 production = new Production17_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}