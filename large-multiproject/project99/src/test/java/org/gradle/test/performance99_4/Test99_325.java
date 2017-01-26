package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_325 {
    private final Production99_325 production = new Production99_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}