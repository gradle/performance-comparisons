package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_347 {
    private final Production84_347 production = new Production84_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}