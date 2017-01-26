package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_57 {
    private final Production91_57 production = new Production91_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}