package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_126 {
    private final Production92_126 production = new Production92_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}