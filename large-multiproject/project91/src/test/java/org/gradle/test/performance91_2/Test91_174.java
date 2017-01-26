package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_174 {
    private final Production91_174 production = new Production91_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}