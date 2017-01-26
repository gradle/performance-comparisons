package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_199 {
    private final Production63_199 production = new Production63_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}