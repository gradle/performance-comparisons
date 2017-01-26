package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_80 {
    private final Production63_80 production = new Production63_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}