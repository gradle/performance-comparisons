package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_258 {
    private final Production17_258 production = new Production17_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}