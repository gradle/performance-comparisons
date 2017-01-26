package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_9 {
    private final Production77_9 production = new Production77_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}