package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_112 {
    private final Production20_112 production = new Production20_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}