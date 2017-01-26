package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_227 {
    private final Production97_227 production = new Production97_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}