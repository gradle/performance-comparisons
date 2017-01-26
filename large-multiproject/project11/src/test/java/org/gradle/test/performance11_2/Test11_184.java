package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_184 {
    private final Production11_184 production = new Production11_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}