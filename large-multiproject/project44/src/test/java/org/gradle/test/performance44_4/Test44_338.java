package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_338 {
    private final Production44_338 production = new Production44_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}