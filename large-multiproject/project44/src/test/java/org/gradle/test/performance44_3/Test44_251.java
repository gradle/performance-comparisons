package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_251 {
    private final Production44_251 production = new Production44_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}