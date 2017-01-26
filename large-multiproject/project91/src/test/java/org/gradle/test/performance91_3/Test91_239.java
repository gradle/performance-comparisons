package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_239 {
    private final Production91_239 production = new Production91_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}