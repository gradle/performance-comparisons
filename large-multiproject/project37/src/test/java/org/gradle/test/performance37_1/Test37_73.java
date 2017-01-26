package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_73 {
    private final Production37_73 production = new Production37_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}