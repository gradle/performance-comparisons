package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_470 {
    private final Production91_470 production = new Production91_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}