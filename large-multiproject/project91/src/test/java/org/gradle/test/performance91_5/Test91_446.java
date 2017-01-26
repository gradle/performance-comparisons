package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_446 {
    private final Production91_446 production = new Production91_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}