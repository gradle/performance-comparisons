package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_74 {
    private final Production74_74 production = new Production74_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}