package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_226 {
    private final Production91_226 production = new Production91_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}