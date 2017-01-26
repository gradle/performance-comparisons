package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_370 {
    private final Production91_370 production = new Production91_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}