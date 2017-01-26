package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_458 {
    private final Production74_458 production = new Production74_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}