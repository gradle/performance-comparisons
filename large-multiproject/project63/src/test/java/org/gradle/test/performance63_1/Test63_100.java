package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_100 {
    private final Production63_100 production = new Production63_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}