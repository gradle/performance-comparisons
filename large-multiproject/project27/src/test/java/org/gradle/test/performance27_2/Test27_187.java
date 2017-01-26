package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_187 {
    private final Production27_187 production = new Production27_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}