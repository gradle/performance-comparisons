package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_303 {
    private final Production44_303 production = new Production44_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}