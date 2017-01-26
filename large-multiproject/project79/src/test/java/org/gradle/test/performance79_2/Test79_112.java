package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_112 {
    private final Production79_112 production = new Production79_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}