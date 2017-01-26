package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_55 {
    private final Production91_55 production = new Production91_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}