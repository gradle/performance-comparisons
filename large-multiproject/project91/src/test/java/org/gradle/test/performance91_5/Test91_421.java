package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_421 {
    private final Production91_421 production = new Production91_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}