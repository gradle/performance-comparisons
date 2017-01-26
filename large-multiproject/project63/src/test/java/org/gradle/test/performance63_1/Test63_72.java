package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_72 {
    private final Production63_72 production = new Production63_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}