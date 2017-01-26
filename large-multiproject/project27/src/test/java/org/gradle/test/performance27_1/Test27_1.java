package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_1 {
    private final Production27_1 production = new Production27_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}