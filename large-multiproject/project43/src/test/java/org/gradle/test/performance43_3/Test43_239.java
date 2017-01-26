package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_239 {
    private final Production43_239 production = new Production43_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}