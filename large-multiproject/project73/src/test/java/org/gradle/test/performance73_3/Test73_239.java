package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_239 {
    private final Production73_239 production = new Production73_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}