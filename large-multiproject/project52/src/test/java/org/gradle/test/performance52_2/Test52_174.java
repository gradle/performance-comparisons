package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_174 {
    private final Production52_174 production = new Production52_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}