package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_227 {
    private final Production81_227 production = new Production81_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}