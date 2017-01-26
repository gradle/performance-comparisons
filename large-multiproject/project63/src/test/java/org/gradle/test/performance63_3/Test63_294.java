package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_294 {
    private final Production63_294 production = new Production63_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}