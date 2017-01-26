package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_53 {
    private final Production17_53 production = new Production17_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}