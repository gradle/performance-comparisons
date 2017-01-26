package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_349 {
    private final Production91_349 production = new Production91_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}