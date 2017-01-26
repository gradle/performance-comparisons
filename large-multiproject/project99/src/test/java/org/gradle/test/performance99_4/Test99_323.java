package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_323 {
    private final Production99_323 production = new Production99_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}