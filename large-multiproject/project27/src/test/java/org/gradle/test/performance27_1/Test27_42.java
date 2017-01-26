package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_42 {
    private final Production27_42 production = new Production27_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}