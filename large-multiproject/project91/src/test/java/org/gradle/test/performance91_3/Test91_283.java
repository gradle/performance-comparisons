package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_283 {
    private final Production91_283 production = new Production91_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}