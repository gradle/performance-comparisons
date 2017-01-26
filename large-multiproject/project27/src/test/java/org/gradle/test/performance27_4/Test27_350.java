package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_350 {
    private final Production27_350 production = new Production27_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}