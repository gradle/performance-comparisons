package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_317 {
    private final Production17_317 production = new Production17_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}