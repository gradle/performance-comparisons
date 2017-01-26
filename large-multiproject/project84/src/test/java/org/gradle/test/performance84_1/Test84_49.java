package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_49 {
    private final Production84_49 production = new Production84_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}