package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_162 {
    private final Production27_162 production = new Production27_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}