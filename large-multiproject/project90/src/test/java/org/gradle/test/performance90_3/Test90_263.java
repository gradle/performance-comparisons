package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_263 {
    private final Production90_263 production = new Production90_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}