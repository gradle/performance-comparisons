package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_96 {
    private final Production63_96 production = new Production63_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}