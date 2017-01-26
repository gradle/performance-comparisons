package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_45 {
    private final Production99_45 production = new Production99_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}