package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_68 {
    private final Production74_68 production = new Production74_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}