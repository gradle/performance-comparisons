package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_392 {
    private final Production15_392 production = new Production15_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}