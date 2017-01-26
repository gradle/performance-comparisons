package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_398 {
    private final Production27_398 production = new Production27_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}