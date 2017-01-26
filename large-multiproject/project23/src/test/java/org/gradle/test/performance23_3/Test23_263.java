package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_263 {
    private final Production23_263 production = new Production23_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}