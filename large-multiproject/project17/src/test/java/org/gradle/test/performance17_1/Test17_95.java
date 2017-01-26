package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_95 {
    private final Production17_95 production = new Production17_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}