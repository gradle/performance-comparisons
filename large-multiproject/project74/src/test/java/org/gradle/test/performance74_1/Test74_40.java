package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_40 {
    private final Production74_40 production = new Production74_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}