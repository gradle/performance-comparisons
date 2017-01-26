package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_93 {
    private final Production63_93 production = new Production63_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}