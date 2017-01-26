package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_438 {
    private final Production91_438 production = new Production91_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}