package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_440 {
    private final Production27_440 production = new Production27_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}