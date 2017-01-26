package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_14 {
    private final Production27_14 production = new Production27_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}