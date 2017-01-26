package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_446 {
    private final Production17_446 production = new Production17_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}