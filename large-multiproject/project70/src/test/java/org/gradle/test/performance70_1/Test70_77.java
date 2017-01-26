package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_77 {
    private final Production70_77 production = new Production70_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}