package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_175 {
    private final Production91_175 production = new Production91_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}