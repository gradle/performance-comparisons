package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_77 {
    private final Production77_77 production = new Production77_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}