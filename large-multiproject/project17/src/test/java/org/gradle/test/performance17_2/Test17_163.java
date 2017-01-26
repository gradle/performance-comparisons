package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_163 {
    private final Production17_163 production = new Production17_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}