package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_317 {
    private final Production91_317 production = new Production91_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}