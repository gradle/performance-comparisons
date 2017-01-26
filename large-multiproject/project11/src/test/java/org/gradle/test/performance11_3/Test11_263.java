package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_263 {
    private final Production11_263 production = new Production11_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}