package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_288 {
    private final Production70_288 production = new Production70_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}