package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_244 {
    private final Production27_244 production = new Production27_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}