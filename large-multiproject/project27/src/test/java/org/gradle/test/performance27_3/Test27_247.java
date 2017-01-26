package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_247 {
    private final Production27_247 production = new Production27_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}