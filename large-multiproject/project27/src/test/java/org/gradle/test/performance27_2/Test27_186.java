package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_186 {
    private final Production27_186 production = new Production27_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}