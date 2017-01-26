package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_263 {
    private final Production36_263 production = new Production36_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}