package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_465 {
    private final Production74_465 production = new Production74_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}