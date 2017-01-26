package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_113 {
    private final Production17_113 production = new Production17_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}