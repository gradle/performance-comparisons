package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_75 {
    private final Production63_75 production = new Production63_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}