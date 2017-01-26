package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_371 {
    private final Production27_371 production = new Production27_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}