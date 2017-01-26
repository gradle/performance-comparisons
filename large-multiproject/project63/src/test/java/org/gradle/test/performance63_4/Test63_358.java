package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_358 {
    private final Production63_358 production = new Production63_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}