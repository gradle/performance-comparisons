package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_310 {
    private final Production27_310 production = new Production27_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}