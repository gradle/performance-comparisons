package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_290 {
    private final Production17_290 production = new Production17_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}