package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_445 {
    private final Production4_445 production = new Production4_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}