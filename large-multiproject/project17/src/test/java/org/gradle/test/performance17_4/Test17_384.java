package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_384 {
    private final Production17_384 production = new Production17_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}