package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_488 {
    private final Production19_488 production = new Production19_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}