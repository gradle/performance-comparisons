package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_257 {
    private final Production70_257 production = new Production70_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}