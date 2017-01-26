package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_173 {
    private final Production17_173 production = new Production17_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}