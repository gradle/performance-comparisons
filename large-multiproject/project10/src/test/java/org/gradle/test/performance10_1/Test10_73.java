package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_73 {
    private final Production10_73 production = new Production10_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}