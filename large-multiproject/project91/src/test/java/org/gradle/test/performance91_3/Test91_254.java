package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_254 {
    private final Production91_254 production = new Production91_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}