package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_242 {
    private final Production91_242 production = new Production91_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}