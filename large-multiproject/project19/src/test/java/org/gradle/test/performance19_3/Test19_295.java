package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_295 {
    private final Production19_295 production = new Production19_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}