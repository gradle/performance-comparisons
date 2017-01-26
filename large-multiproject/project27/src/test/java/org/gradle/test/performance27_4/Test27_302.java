package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_302 {
    private final Production27_302 production = new Production27_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}