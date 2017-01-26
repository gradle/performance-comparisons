package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_263 {
    private final Production60_263 production = new Production60_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}