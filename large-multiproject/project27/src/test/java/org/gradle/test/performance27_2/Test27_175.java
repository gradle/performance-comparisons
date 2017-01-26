package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_175 {
    private final Production27_175 production = new Production27_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}