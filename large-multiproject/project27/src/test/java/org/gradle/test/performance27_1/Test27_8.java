package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_8 {
    private final Production27_8 production = new Production27_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}