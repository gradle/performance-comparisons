package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_418 {
    private final Production17_418 production = new Production17_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}