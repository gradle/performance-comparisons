package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_267 {
    private final Production92_267 production = new Production92_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}