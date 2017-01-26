package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_174 {
    private final Production64_174 production = new Production64_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}