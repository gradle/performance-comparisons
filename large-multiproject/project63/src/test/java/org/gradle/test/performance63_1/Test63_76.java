package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_76 {
    private final Production63_76 production = new Production63_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}