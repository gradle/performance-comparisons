package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_267 {
    private final Production74_267 production = new Production74_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}