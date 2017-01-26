package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_181 {
    private final Production19_181 production = new Production19_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}