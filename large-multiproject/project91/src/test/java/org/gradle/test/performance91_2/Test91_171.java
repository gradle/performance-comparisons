package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_171 {
    private final Production91_171 production = new Production91_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}