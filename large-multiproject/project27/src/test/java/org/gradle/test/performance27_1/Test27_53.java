package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_53 {
    private final Production27_53 production = new Production27_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}