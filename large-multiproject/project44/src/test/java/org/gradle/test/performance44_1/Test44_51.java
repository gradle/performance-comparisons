package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_51 {
    private final Production44_51 production = new Production44_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}