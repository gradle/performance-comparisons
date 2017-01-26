package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_183 {
    private final Production74_183 production = new Production74_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}