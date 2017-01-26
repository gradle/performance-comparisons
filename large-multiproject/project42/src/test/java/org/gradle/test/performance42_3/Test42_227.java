package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_227 {
    private final Production42_227 production = new Production42_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}