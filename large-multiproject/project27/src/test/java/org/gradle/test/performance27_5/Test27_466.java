package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_466 {
    private final Production27_466 production = new Production27_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}