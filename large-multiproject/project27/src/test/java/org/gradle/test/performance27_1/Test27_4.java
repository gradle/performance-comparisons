package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_4 {
    private final Production27_4 production = new Production27_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}