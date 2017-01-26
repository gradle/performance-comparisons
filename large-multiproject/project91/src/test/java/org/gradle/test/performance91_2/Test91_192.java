package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_192 {
    private final Production91_192 production = new Production91_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}