package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_325 {
    private final Production92_325 production = new Production92_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}