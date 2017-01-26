package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_331 {
    private final Production77_331 production = new Production77_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}