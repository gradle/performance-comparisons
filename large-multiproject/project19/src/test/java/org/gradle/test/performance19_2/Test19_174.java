package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_174 {
    private final Production19_174 production = new Production19_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}