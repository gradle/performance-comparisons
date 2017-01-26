package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_58 {
    private final Production27_58 production = new Production27_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}