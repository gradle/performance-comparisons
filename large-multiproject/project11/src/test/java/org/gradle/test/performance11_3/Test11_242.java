package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_242 {
    private final Production11_242 production = new Production11_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}