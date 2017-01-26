package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_73 {
    private final Production77_73 production = new Production77_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}