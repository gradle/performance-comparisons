package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_216 {
    private final Production17_216 production = new Production17_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}