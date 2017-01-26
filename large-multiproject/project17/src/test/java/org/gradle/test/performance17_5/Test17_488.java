package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_488 {
    private final Production17_488 production = new Production17_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}