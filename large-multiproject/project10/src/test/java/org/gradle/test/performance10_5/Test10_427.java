package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_427 {
    private final Production10_427 production = new Production10_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}