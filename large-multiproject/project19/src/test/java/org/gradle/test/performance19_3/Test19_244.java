package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_244 {
    private final Production19_244 production = new Production19_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}