package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_288 {
    private final Production10_288 production = new Production10_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}