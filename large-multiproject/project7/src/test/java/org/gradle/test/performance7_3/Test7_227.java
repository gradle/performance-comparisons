package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_227 {
    private final Production7_227 production = new Production7_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}