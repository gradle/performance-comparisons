package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_238 {
    private final Production44_238 production = new Production44_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}