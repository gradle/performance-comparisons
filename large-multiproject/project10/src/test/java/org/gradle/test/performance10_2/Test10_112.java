package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_112 {
    private final Production10_112 production = new Production10_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}