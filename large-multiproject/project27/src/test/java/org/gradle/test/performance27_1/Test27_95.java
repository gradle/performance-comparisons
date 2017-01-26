package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_95 {
    private final Production27_95 production = new Production27_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}