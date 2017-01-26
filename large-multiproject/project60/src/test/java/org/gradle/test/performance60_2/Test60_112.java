package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_112 {
    private final Production60_112 production = new Production60_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}