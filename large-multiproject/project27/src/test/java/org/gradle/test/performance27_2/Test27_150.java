package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_150 {
    private final Production27_150 production = new Production27_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}