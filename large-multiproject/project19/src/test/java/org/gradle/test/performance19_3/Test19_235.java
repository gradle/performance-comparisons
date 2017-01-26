package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_235 {
    private final Production19_235 production = new Production19_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}