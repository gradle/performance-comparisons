package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_468 {
    private final Production19_468 production = new Production19_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}