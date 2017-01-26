package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_227 {
    private final Production1_227 production = new Production1_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}