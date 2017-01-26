package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_425 {
    private final Production70_425 production = new Production70_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}