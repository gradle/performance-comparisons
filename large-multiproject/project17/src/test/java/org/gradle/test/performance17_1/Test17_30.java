package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_30 {
    private final Production17_30 production = new Production17_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}