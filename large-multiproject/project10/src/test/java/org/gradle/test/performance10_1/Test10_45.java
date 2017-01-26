package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_45 {
    private final Production10_45 production = new Production10_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}