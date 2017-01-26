package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_347 {
    private final Production77_347 production = new Production77_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}