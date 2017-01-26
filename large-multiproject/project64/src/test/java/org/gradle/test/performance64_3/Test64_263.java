package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_263 {
    private final Production64_263 production = new Production64_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}