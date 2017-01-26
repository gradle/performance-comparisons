package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_325 {
    private final Production77_325 production = new Production77_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}