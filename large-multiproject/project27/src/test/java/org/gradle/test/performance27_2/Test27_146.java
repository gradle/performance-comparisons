package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_146 {
    private final Production27_146 production = new Production27_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}