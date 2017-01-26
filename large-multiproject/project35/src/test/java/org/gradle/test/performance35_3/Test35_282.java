package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_282 {
    private final Production35_282 production = new Production35_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}