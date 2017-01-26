package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_295 {
    private final Production91_295 production = new Production91_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}