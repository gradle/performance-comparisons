package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_309 {
    private final Production17_309 production = new Production17_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}