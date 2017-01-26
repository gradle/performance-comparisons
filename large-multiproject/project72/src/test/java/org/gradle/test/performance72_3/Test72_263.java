package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_263 {
    private final Production72_263 production = new Production72_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}