package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_77 {
    private final Production10_77 production = new Production10_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}