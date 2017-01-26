package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_97 {
    private final Production74_97 production = new Production74_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}