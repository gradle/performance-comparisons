package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_73 {
    private final Production93_73 production = new Production93_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}