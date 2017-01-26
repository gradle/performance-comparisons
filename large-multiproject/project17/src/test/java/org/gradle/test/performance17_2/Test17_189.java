package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_189 {
    private final Production17_189 production = new Production17_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}