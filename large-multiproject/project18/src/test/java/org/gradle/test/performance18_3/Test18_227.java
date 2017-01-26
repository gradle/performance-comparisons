package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_227 {
    private final Production18_227 production = new Production18_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}