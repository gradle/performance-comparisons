package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_271 {
    private final Production91_271 production = new Production91_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}