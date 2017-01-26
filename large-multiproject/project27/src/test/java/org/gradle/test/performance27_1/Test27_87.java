package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_87 {
    private final Production27_87 production = new Production27_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}