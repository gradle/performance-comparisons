package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_500 {
    private final Production92_500 production = new Production92_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}