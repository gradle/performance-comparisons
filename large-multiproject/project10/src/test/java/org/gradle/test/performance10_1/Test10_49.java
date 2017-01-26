package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_49 {
    private final Production10_49 production = new Production10_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}