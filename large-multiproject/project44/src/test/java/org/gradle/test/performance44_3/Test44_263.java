package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_263 {
    private final Production44_263 production = new Production44_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}