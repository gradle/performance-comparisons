package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_331 {
    private final Production10_331 production = new Production10_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}