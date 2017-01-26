package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_288 {
    private final Production63_288 production = new Production63_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}