package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_5 {
    private final Production17_5 production = new Production17_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}