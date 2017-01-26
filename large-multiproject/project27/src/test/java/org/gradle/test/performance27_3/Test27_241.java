package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_241 {
    private final Production27_241 production = new Production27_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}