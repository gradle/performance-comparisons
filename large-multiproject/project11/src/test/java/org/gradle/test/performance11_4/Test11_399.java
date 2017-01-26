package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_399 {
    private final Production11_399 production = new Production11_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}