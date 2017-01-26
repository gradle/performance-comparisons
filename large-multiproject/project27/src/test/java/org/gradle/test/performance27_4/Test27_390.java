package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_390 {
    private final Production27_390 production = new Production27_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}