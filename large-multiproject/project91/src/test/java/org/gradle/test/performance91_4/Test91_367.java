package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_367 {
    private final Production91_367 production = new Production91_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}