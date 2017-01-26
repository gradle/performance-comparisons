package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_237 {
    private final Production91_237 production = new Production91_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}