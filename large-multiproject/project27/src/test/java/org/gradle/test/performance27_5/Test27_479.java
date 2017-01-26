package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_479 {
    private final Production27_479 production = new Production27_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}