package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_263 {
    private final Production24_263 production = new Production24_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}