package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_347 {
    private final Production74_347 production = new Production74_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}