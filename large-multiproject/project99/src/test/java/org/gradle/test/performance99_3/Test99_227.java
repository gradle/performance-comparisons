package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_227 {
    private final Production99_227 production = new Production99_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}