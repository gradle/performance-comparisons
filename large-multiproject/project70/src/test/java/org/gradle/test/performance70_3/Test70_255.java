package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_255 {
    private final Production70_255 production = new Production70_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}