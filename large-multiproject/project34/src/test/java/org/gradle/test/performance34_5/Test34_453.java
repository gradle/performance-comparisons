package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_453 {
    private final Production34_453 production = new Production34_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}