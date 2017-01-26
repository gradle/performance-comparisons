package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_229 {
    private final Production99_229 production = new Production99_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}