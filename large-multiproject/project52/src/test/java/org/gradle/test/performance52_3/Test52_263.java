package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_263 {
    private final Production52_263 production = new Production52_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}