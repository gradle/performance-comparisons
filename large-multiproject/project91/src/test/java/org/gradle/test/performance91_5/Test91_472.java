package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_472 {
    private final Production91_472 production = new Production91_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}