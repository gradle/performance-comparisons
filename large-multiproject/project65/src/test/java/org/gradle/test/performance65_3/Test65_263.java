package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_263 {
    private final Production65_263 production = new Production65_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}