package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_325 {
    private final Production74_325 production = new Production74_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}