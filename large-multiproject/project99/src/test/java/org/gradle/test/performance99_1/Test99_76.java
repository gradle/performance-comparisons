package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_76 {
    private final Production99_76 production = new Production99_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}