package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_318 {
    private final Production17_318 production = new Production17_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}