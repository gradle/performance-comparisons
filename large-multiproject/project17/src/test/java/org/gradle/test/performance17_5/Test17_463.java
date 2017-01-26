package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_463 {
    private final Production17_463 production = new Production17_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}