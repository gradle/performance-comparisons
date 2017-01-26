package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_480 {
    private final Production11_480 production = new Production11_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}