package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_5 {
    private final Production27_5 production = new Production27_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}