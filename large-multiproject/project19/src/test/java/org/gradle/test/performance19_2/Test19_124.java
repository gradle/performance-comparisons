package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_124 {
    private final Production19_124 production = new Production19_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}