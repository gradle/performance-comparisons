package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_458 {
    private final Production99_458 production = new Production99_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}