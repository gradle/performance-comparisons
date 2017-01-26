package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_75 {
    private final Production99_75 production = new Production99_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}