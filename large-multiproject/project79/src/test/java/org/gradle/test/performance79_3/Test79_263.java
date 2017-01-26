package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_263 {
    private final Production79_263 production = new Production79_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}