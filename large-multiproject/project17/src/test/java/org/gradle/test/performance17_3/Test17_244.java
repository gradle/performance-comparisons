package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_244 {
    private final Production17_244 production = new Production17_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}