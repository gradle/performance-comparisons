package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_474 {
    private final Production17_474 production = new Production17_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}