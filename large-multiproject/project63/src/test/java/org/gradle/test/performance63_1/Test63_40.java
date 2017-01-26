package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_40 {
    private final Production63_40 production = new Production63_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}