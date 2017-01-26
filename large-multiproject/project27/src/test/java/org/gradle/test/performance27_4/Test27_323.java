package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_323 {
    private final Production27_323 production = new Production27_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}