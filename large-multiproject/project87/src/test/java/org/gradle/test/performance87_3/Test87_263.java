package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_263 {
    private final Production87_263 production = new Production87_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}