package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_112 {
    private final Production30_112 production = new Production30_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}