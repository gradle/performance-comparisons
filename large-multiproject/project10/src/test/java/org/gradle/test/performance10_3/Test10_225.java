package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_225 {
    private final Production10_225 production = new Production10_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}