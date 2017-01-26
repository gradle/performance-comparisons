package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_441 {
    private final Production11_441 production = new Production11_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}