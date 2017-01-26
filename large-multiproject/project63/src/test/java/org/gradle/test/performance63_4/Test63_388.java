package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_388 {
    private final Production63_388 production = new Production63_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}