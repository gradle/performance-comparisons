package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_72 {
    private final Production99_72 production = new Production99_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}