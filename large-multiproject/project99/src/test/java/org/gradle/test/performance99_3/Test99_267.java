package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_267 {
    private final Production99_267 production = new Production99_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}