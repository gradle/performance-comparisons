package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_356 {
    private final Production74_356 production = new Production74_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}