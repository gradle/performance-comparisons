package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_112 {
    private final Production90_112 production = new Production90_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}