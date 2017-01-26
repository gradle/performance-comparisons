package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_379 {
    private final Production91_379 production = new Production91_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}