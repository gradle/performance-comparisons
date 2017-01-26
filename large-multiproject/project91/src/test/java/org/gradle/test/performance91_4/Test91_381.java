package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_381 {
    private final Production91_381 production = new Production91_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}