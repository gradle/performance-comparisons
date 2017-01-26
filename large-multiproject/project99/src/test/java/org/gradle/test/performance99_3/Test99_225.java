package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_225 {
    private final Production99_225 production = new Production99_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}