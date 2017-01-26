package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_392 {
    private final Production20_392 production = new Production20_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}