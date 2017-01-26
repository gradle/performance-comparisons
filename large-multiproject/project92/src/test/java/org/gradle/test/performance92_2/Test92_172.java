package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_172 {
    private final Production92_172 production = new Production92_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}