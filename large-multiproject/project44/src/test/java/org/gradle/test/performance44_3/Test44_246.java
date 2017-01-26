package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_246 {
    private final Production44_246 production = new Production44_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}