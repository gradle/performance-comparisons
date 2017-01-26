package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_367 {
    private final Production59_367 production = new Production59_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}