package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_239 {
    private final Production49_239 production = new Production49_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}