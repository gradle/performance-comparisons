package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_347 {
    private final Production35_347 production = new Production35_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}