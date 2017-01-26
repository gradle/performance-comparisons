package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_81 {
    private final Production27_81 production = new Production27_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}