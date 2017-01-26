package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_43 {
    private final Production77_43 production = new Production77_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}