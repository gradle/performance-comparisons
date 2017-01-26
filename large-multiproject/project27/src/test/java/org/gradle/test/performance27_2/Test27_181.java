package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_181 {
    private final Production27_181 production = new Production27_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}