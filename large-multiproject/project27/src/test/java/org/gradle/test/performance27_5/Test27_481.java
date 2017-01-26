package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_481 {
    private final Production27_481 production = new Production27_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}