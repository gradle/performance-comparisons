package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_387 {
    private final Production17_387 production = new Production17_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}