package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_112 {
    private final Production11_112 production = new Production11_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}