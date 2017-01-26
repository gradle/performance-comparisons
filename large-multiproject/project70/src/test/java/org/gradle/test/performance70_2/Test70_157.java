package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_157 {
    private final Production70_157 production = new Production70_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}