package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_45 {
    private final Production63_45 production = new Production63_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}