package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_263 {
    private final Production51_263 production = new Production51_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}