package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_445 {
    private final Production77_445 production = new Production77_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}