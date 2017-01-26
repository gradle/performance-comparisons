package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_452 {
    private final Production91_452 production = new Production91_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}