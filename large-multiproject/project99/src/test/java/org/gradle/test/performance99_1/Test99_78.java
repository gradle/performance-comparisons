package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_78 {
    private final Production99_78 production = new Production99_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}