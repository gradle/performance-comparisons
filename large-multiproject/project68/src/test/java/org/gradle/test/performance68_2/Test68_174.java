package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_174 {
    private final Production68_174 production = new Production68_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}