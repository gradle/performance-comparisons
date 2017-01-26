package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_364 {
    private final Production27_364 production = new Production27_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}