package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_139 {
    private final Production91_139 production = new Production91_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}