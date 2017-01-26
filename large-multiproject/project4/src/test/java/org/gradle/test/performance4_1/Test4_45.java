package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_45 {
    private final Production4_45 production = new Production4_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}