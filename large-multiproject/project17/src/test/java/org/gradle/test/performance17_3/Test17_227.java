package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_227 {
    private final Production17_227 production = new Production17_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}