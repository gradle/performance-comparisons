package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_204 {
    private final Production74_204 production = new Production74_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}