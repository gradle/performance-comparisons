package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_325 {
    private final Production44_325 production = new Production44_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}