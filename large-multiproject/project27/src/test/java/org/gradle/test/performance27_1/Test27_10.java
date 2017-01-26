package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_10 {
    private final Production27_10 production = new Production27_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}