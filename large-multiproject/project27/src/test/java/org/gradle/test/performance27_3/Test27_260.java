package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_260 {
    private final Production27_260 production = new Production27_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}