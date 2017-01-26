package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_150 {
    private final Production19_150 production = new Production19_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}