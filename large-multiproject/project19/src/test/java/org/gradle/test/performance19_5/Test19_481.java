package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_481 {
    private final Production19_481 production = new Production19_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}