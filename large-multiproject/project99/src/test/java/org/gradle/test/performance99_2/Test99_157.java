package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_157 {
    private final Production99_157 production = new Production99_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}