package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_458 {
    private final Production44_458 production = new Production44_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}