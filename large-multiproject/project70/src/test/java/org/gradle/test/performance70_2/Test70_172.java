package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_172 {
    private final Production70_172 production = new Production70_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}