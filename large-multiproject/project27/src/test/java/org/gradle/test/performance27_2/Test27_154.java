package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_154 {
    private final Production27_154 production = new Production27_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}