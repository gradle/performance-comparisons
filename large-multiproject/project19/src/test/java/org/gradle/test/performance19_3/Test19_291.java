package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_291 {
    private final Production19_291 production = new Production19_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}