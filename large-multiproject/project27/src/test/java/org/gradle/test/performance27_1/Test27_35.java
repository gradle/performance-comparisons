package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_35 {
    private final Production27_35 production = new Production27_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}