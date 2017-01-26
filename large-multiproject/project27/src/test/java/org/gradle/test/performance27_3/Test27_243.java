package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_243 {
    private final Production27_243 production = new Production27_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}