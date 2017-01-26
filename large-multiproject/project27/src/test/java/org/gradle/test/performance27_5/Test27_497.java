package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_497 {
    private final Production27_497 production = new Production27_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}