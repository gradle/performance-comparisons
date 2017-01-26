package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_177 {
    private final Production91_177 production = new Production91_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}