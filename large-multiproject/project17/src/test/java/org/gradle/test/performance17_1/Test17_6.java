package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_6 {
    private final Production17_6 production = new Production17_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}