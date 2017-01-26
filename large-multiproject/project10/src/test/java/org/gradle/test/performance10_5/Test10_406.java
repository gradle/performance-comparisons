package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_406 {
    private final Production10_406 production = new Production10_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}