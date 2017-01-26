package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_338 {
    private final Production7_338 production = new Production7_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}