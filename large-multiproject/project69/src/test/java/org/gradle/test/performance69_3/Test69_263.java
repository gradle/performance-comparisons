package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_263 {
    private final Production69_263 production = new Production69_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}