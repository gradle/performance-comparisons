package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_261 {
    private final Production34_261 production = new Production34_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}