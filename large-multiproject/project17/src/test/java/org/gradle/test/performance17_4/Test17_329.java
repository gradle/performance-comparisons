package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_329 {
    private final Production17_329 production = new Production17_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}