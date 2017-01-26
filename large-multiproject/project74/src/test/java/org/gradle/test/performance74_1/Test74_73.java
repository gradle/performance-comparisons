package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_73 {
    private final Production74_73 production = new Production74_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}