package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_209 {
    private final Production63_209 production = new Production63_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}