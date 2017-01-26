package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_432 {
    private final Production74_432 production = new Production74_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}