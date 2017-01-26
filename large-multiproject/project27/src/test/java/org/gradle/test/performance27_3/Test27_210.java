package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_210 {
    private final Production27_210 production = new Production27_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}