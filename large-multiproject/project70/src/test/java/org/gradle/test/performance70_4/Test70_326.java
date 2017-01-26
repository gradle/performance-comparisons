package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_326 {
    private final Production70_326 production = new Production70_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}