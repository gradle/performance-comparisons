package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_343 {
    private final Production19_343 production = new Production19_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}