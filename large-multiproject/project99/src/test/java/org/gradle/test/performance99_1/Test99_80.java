package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_80 {
    private final Production99_80 production = new Production99_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}