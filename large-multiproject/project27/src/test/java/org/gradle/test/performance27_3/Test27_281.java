package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_281 {
    private final Production27_281 production = new Production27_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}