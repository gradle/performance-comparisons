package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_304 {
    private final Production44_304 production = new Production44_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}