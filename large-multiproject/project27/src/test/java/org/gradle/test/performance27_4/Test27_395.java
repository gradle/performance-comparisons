package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_395 {
    private final Production27_395 production = new Production27_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}