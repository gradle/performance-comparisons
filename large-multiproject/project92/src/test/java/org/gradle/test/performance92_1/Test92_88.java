package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_88 {
    private final Production92_88 production = new Production92_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}