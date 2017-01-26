package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_239 {
    private final Production44_239 production = new Production44_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}