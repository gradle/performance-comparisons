package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_225 {
    private final Production63_225 production = new Production63_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}