package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_491 {
    private final Production34_491 production = new Production34_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}