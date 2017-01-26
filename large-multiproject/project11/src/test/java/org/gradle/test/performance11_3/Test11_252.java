package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_252 {
    private final Production11_252 production = new Production11_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}