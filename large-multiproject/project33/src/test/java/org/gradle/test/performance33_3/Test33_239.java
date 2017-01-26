package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_239 {
    private final Production33_239 production = new Production33_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}