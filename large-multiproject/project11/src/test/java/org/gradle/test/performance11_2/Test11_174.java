package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_174 {
    private final Production11_174 production = new Production11_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}