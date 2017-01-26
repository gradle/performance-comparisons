package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_458 {
    private final Production27_458 production = new Production27_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}