package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_174 {
    private final Production2_174 production = new Production2_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}