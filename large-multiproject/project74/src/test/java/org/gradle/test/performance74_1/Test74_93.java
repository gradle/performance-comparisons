package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_93 {
    private final Production74_93 production = new Production74_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}