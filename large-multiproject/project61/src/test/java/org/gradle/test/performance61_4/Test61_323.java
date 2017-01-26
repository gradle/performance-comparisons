package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_323 {
    private final Production61_323 production = new Production61_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}