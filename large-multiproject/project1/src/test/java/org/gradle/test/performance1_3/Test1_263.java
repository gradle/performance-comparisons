package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_263 {
    private final Production1_263 production = new Production1_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}