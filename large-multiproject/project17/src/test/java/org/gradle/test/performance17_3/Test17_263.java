package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_263 {
    private final Production17_263 production = new Production17_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}