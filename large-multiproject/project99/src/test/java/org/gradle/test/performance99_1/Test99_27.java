package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_27 {
    private final Production99_27 production = new Production99_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}