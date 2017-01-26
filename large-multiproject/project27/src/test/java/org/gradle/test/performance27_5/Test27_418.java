package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_418 {
    private final Production27_418 production = new Production27_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}