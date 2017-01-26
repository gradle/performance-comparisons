package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_392 {
    private final Production18_392 production = new Production18_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}