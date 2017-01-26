package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_263 {
    private final Production85_263 production = new Production85_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}