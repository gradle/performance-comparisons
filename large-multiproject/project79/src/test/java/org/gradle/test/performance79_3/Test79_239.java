package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_239 {
    private final Production79_239 production = new Production79_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}