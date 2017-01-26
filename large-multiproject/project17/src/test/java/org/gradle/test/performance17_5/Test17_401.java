package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_401 {
    private final Production17_401 production = new Production17_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}