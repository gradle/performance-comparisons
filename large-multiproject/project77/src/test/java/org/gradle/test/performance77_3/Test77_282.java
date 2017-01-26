package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_282 {
    private final Production77_282 production = new Production77_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}