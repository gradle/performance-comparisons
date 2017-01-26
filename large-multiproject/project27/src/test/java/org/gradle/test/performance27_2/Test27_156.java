package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_156 {
    private final Production27_156 production = new Production27_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}