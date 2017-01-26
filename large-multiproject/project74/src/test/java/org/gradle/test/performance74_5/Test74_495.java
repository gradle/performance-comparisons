package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_495 {
    private final Production74_495 production = new Production74_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}