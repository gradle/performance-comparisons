package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_263 {
    private final Production56_263 production = new Production56_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}