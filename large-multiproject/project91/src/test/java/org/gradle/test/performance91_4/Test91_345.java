package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_345 {
    private final Production91_345 production = new Production91_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}