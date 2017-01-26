package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_291 {
    private final Production34_291 production = new Production34_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}