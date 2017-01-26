package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_263 {
    private final Production71_263 production = new Production71_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}