package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_498 {
    private final Production70_498 production = new Production70_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}