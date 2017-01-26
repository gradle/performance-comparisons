package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_241 {
    private final Production17_241 production = new Production17_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}