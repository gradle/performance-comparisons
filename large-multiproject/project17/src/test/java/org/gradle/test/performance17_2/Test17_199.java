package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_199 {
    private final Production17_199 production = new Production17_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}