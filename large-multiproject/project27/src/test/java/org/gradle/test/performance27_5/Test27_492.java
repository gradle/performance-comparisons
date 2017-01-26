package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_492 {
    private final Production27_492 production = new Production27_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}