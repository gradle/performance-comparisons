package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_473 {
    private final Production91_473 production = new Production91_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}