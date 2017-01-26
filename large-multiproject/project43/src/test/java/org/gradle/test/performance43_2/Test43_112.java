package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_112 {
    private final Production43_112 production = new Production43_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}