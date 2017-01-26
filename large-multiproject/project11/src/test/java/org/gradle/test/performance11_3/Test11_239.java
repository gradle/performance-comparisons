package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_239 {
    private final Production11_239 production = new Production11_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}