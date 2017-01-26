package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_158 {
    private final Production19_158 production = new Production19_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}