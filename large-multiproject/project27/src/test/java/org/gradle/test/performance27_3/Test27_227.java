package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_227 {
    private final Production27_227 production = new Production27_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}