package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_268 {
    private final Production44_268 production = new Production44_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}