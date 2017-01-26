package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_500 {
    private final Production27_500 production = new Production27_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}