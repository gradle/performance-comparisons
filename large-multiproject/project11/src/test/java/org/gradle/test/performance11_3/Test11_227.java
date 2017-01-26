package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_227 {
    private final Production11_227 production = new Production11_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}