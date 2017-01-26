package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_49 {
    private final Production4_49 production = new Production4_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}