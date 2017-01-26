package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_102 {
    private final Production70_102 production = new Production70_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}