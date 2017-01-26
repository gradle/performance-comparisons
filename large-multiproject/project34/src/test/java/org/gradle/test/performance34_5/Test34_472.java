package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_472 {
    private final Production34_472 production = new Production34_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}