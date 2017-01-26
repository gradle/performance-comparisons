package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_168 {
    private final Production92_168 production = new Production92_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}