package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_263 {
    private final Production46_263 production = new Production46_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}