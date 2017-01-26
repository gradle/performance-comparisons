package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_329 {
    private final Production33_329 production = new Production33_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}