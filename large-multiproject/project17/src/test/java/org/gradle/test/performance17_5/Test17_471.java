package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_471 {
    private final Production17_471 production = new Production17_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}