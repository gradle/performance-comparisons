package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_267 {
    private final Production63_267 production = new Production63_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}