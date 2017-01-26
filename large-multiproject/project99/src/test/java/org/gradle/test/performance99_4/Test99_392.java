package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_392 {
    private final Production99_392 production = new Production99_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}