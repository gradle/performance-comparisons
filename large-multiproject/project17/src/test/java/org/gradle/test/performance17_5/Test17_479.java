package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_479 {
    private final Production17_479 production = new Production17_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}