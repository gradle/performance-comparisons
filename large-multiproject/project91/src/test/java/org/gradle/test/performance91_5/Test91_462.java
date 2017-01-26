package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_462 {
    private final Production91_462 production = new Production91_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}