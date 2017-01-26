package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_445 {
    private final Production99_445 production = new Production99_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}