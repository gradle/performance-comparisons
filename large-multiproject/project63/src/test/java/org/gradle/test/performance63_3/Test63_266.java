package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_266 {
    private final Production63_266 production = new Production63_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}