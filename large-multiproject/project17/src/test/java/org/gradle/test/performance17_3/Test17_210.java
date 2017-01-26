package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_210 {
    private final Production17_210 production = new Production17_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}