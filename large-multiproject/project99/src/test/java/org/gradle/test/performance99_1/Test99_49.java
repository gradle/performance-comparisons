package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_49 {
    private final Production99_49 production = new Production99_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}