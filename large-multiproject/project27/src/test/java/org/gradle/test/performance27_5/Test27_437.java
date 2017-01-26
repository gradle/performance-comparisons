package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_437 {
    private final Production27_437 production = new Production27_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}