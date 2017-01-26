package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_403 {
    private final Production19_403 production = new Production19_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}