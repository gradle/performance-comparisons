package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_164 {
    private final Production27_164 production = new Production27_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}