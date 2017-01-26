package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_263 {
    private final Production95_263 production = new Production95_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}