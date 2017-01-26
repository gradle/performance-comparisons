package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_82 {
    private final Production77_82 production = new Production77_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}