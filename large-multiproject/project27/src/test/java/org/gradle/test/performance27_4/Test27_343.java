package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_343 {
    private final Production27_343 production = new Production27_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}