package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_213 {
    private final Production27_213 production = new Production27_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}