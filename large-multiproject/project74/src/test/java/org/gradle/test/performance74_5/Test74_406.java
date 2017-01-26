package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_406 {
    private final Production74_406 production = new Production74_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}