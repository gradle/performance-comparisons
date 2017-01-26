package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_484 {
    private final Production11_484 production = new Production11_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}