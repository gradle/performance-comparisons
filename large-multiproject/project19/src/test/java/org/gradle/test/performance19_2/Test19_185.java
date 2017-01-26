package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_185 {
    private final Production19_185 production = new Production19_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}