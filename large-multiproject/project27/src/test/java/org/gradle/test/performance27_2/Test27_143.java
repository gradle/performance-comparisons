package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_143 {
    private final Production27_143 production = new Production27_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}