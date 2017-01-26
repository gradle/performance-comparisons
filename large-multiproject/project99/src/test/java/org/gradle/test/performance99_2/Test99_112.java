package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_112 {
    private final Production99_112 production = new Production99_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}