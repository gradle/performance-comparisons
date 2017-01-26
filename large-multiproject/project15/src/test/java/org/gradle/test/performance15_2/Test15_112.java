package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_112 {
    private final Production15_112 production = new Production15_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}