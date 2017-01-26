package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_161 {
    private final Production27_161 production = new Production27_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}