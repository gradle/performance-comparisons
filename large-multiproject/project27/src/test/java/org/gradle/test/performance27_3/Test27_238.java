package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_238 {
    private final Production27_238 production = new Production27_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}