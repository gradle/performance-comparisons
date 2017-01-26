package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_333 {
    private final Production11_333 production = new Production11_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}