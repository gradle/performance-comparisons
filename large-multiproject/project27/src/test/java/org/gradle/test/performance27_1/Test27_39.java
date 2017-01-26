package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_39 {
    private final Production27_39 production = new Production27_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}