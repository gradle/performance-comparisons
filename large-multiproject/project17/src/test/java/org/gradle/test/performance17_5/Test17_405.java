package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_405 {
    private final Production17_405 production = new Production17_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}