package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_112 {
    private final Production24_112 production = new Production24_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}