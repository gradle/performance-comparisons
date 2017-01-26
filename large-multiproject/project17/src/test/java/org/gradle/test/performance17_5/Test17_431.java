package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_431 {
    private final Production17_431 production = new Production17_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}