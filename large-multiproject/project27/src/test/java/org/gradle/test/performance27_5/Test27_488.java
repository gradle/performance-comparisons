package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_488 {
    private final Production27_488 production = new Production27_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}