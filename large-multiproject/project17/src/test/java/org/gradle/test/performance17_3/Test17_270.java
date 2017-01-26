package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_270 {
    private final Production17_270 production = new Production17_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}