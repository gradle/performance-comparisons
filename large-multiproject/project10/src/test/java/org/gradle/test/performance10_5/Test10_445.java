package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_445 {
    private final Production10_445 production = new Production10_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}