package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_239 {
    private final Production45_239 production = new Production45_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}