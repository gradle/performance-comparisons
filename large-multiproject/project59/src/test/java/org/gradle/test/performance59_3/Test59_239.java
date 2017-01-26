package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_239 {
    private final Production59_239 production = new Production59_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}